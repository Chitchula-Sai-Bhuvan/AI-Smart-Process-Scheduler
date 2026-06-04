import matplotlib.pyplot as plt

algorithms = [
    'FCFS',
    'SJF',
    'Round Robin',
    'Priority'
]

waiting_times = [5.75, 4.75, 10.25, 4.75]

plt.bar(algorithms, waiting_times)

plt.xlabel('Scheduling Algorithms')

plt.ylabel('Average Waiting Time')
plt.title('Algorithm Performance Comparison')

plt.savefig("performance_graph.png")

plt.show()