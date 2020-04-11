import 'package:flutter/material.dart';

import 'AppColors.dart';
import 'HomePage.dart';

void main() => runApp(WhimsicalPasticheApp());

class WhimsicalPasticheApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'App title',
      theme: ThemeData(
        primarySwatch: AppColors.primarySwatch,
      ),
      home: HomePage(title: 'Home Page'),
    );
  }
}
