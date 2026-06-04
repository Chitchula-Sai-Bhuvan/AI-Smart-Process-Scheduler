import matplotlib.pyplot as plt

processes = ['P1', 'P2', 'P3', 'P4']

start_times = [0, 5, 8, 16]

burst_times = [5, 3, 8, 6]

fig, ax = plt.subplots()

for i in range(len(processes)):

    ax.broken_barh(
        [(start_times[i], burst_times[i])],
        (i * 10, 9)
    )

ax.set_yticks([5, 15, 25, 35])

ax.set_yticklabels(processes)

ax.set_xlabel('CPU Time')

ax.set_title('CPU Scheduling Gantt Chart')

plt.show()