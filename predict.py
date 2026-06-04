import joblib
import pandas as pd

# LOAD MODEL

model = joblib.load('scheduler_model.pkl')

# NEW PROCESS DATA

new_process = pd.DataFrame({

    'burst_time': [6],
    'memory_usage': [300],
    'cpu_usage': [75]
})

# PREDICT

prediction = model.predict(new_process)

print(
    'Predicted Waiting Time:',
    prediction[0]
)