import 'package:flutter/material.dart';
import 'package:flutter_swiper/flutter_swiper.dart';

class HomePage extends StatefulWidget {
  HomePage({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  int _currentIndex = 0;

  void _incrementCounter(int index) {
    setState(() {
      _currentIndex = index;
    });
  }

  @override
  Widget build(BuildContext context) {
    var showDebugUi = false;

    Map<int, int> sizes = new Map();
    var first = 4088;
    int o = 0;
    for (int i = first; i > 0; i--) {
      sizes[o++] = i;
    }

    return Scaffold(
        appBar: AppBar(
          title: Text(sizes[_currentIndex].toString()),
        ),
        body: Swiper(
          itemBuilder: (BuildContext context, int index) {
            var height = sizes[index];
            var width = height ~/ 2;
            var url = "http://via.placeholder.com/${width}x$height";
            print("Loading image from $url");
            return new Image.network(
              url,
              fit: BoxFit.contain,
            );
          },
          itemCount: sizes.length,
          index: _currentIndex,
          viewportFraction: 0.94,
          scale: 0.98,
          pagination: showDebugUi ? new FractionPaginationBuilder() : null,
          control: showDebugUi ? new SwiperControl() : null,
          onIndexChanged: _incrementCounter,
        ));
  }
}
