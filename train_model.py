import pandas as pd

from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestRegressor
from sklearn.metrics import mean_absolute_error

import joblib

print("STARTED TRAINING")

# LOAD DATASET

data = pd.read_csv('../dataset/process_data.csv')

print(data)

# INPUT FEATURES

X = data[[
    'burst_time',
    'memory_usage',
    'cpu_usage'
]]

# OUTPUT TARGET

y = data['waiting_time']

# SPLIT DATA

X_train, X_test, y_train, y_test = train_test_split(
    X,
    y,
    test_size=0.2,
    random_state=42
)

print("DATA SPLIT DONE")

# CREATE MODEL

model = RandomForestRegressor()

print("MODEL CREATED")

# TRAIN MODEL

model.fit(X_train, y_train)

print("MODEL TRAINED")

# TEST PREDICTIONS

predictions = model.predict(X_test)

# CHECK ERROR

error = mean_absolute_error(y_test, predictions)

print("Mean Absolute Error:", error)

# SAVE MODEL

joblib.dump(model, 'scheduler_model.pkl')

print("MODEL SAVED SUCCESSFULLY")