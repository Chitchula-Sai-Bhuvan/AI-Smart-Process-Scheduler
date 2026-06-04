# AI Smart Process Scheduler

Advanced process-scheduling simulator with an optional ML-based scheduler and visualizations. This repository demonstrates classical scheduling algorithms (FCFS, SJF, Priority, Round Robin) implemented in Java alongside a Python AI module that trains and runs a scheduling model, plus visualization utilities for results.

Why this repo impresses:
- Clear separation of concerns: `java_scheduler` for core algorithms, `ai_module` for ML model training/prediction, `visualization` for charts.
- End-to-end reproducible examples with runnable scripts and a small sample dataset.
- Clean, testable Java code and a portable Python environment (venv + `requirements.txt`).

Quick start (PowerShell from repo root):
```powershell
cd C:\Users\chitc\Desktop\AI-Smart-Process-Scheduler
# Run Java scheduler
cd java_scheduler
javac *.java
java Main

# Run AI training/prediction
cd ..\ai_module
python -m venv venv
.\venv\Scripts\Activate.ps1
pip install -r requirements.txt
python train_model.py
python predict.py

# Visualize results
cd ..\visualization
.\venv\Scripts\Activate.ps1
python gantt_chart.py
```

Repository layout
- `java_scheduler/` — Java implementations of FCFS, SJF, Priority, Round Robin; entrypoint: [java_scheduler/Main.java](java_scheduler/Main.java#L1).
- `ai_module/` — Python training and prediction scripts for the ML scheduler; see [ai_module/README.md](ai_module/README.md#L1) for details.
- `visualization/` — plotting utilities (Gantt chart, performance graphs).
- `dataset/` — sample process data used for demonstrations.

Next steps for reviewers
- See the architecture section in [ai_module/README.md](ai_module/README.md#L1).
- Run the Java scheduler, then open the generated output CSV in `visualization` for graphs.

License
This project is licensed under the MIT License — see `LICENSE`.

