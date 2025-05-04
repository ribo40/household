# Time-Series Forecasting of Carbon Monoxide (CO) and Nitrogen Dioxide (NO₂) Levels

This project predicts daily/hourly levels of CO(GT) and NO₂(GT) using machine learning and time-series models.

## Table of Contents
1. [Introduction](#introduction)
2. [Project Workflow](#project-workflow)
3. [Dataset Description](#dataset-description)
4. [Data Preprocessing](#data-preprocessing)
5. [EDA](#eda)
6. [Feature Engineering](#feature-engineering)
7. [Modeling](#modeling)
  - [ARIMA for CO(GT)](#ARIMA-for-c-(gt))
  - [Random Forest for NO₂(GT)](#random-forest-for-no₂-(gt))
8. [Evaluation Metrics](#evaluation-metrics)
9. [Results and Insights](#results-and-insights)

## Introduction
Forecasting air pollution levels is critical for public health and environmental monitoring. This project focuses on modeling time-series data to predict CO and NO₂ levels.

## Project Workflow
1. Data Preprocessing
2. Exploratory Data Analysis (EDA)
3. Feature Engineering
4. Model Building
5. Evaluation
6. Visualization and Reporting
   
## Dataset Description

- **Source:** [Provide the source of your dataset]
- **Features:**
  - `Date`: Date of observation
  - `Time`: Time of observation
  - `CO(GT)`: Ground Truth hourly average of CO in mg/m³
  - `NO₂(GT)`: Ground Truth hourly average of NO₂ in µg/m³

## Data Preprocessing

1. Combined `Date` and `Time` into a `datetime` index
2. Resampled data to hourly means
3. Interpolated missing values
4. Removed outliers using the IQR method

## Exploratory Data Analysis (EDA)

- Historical trends of CO and NO₂ levels
- Correlation analysis
- Seasonality patterns (hourly, daily, weekly)

## Feature Engineering
- Created lag features for time-series dependency
- Added time-based features (hour, day of the week, month)

## Modeling

### ARIMA for CO(GT)

- Used ARIMA to capture time-series dependency for CO levels
- Tuned hyperparameters for optimal performance

### Random Forest for NO₂(GT)

- Incorporated external predictors and lag features
- Evaluated feature importance

## Evaluation Metrics
- Mean Absolute Error (MAE)
- Root Mean Squared Error (RMSE)

## Results and Insights
- Forecasted trends for CO(GT) and NO₂(GT)
- Visualized seasonal patterns and long-term trends
- Identified peak pollution hours and provided actionable insights
