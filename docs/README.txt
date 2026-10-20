============================================================
PROJECT README: VANGTICHAI (ASSIGNMENT 1)
============================================================

1. PROJECT INFORMATION
------------------------------------------------------------
- Project Name: VangtiChai
- Course: CSE 489: Mobile Application Development
- Institution: Department of Computer Science and Engineering, BRAC University
- Developer Name: Md. Raihan Chowdhury (ID: 21201796)

2. PROJECT OBJECTIVE & OVERVIEW
------------------------------------------------------------
The goal of this assignment is to build an Android application from scratch that features a custom numeric keypad and calculates the exact currency note breakdown (500, 100, 50, 20, 10, 5, 2, and 1 Taka) based on any entered monetary amount. The application is designed to handle state persistence and adapt gracefully across different screen sizes and orientations (Portrait and Landscape).

3. TESTED DEVICES & SCREEN CONFIGURATIONS
------------------------------------------------------------
As per the assignment requirements, the application has been tested and verified on the following configurations:
- Pixel XL Phone (Tested in both Portrait and Landscape modes)
- Nexus 10 Tablet (Tested in both Portrait and Landscape modes)
- Additional local emulator test environments.

4. TECHNICAL IMPLEMENTATION DETAILS
------------------------------------------------------------
- Developed using Android Studio with custom XML layouts (`ConstraintLayout` and nested `LinearLayouts`).
- All dimens (such as padding, text sizes, and margins) have been extracted to resource files to avoid hardcoding.
- Implemented state saving mechanisms to preserve entered data and change lists during orientation changes.