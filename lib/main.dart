import 'package:flutter/material.dart';

import 'app_colors.dart';
import 'home_page.dart';

void main() => runApp(WhimsicalPasticheApp());

class WhimsicalPasticheApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Whimsical Pastiche',
      theme: ThemeData(
        primarySwatch: AppColors.primarySwatch,
      ),
      home: HomePage(title: 'Home Page'),
    );
  }
}
