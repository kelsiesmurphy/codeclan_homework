tasks = [
    { "description": "Wash Dishes", "completed": False, "time_taken": 10 },
    { "description": "Clean Windows", "completed": False, "time_taken": 15 },
    { "description": "Make Dinner", "completed": True, "time_taken": 30 },
    { "description": "Feed Cat", "completed": False, "time_taken": 5 },
    { "description": "Walk Dog", "completed": True, "time_taken": 60 },
]

# Functions to complete:

## Get a list of uncompleted tasks
def get_uncompleted_tasks(list):
    uncompleted_tasks = []
    for task in list:
        if not task["completed"]:
            uncompleted_tasks.append(task)
    return uncompleted_tasks

#print(get_uncompleted_tasks(tasks))

## Get a list of completed tasks
def get_completed_tasks(list):
    complteted_tasks = []
    for task in list:
        if task["completed"]:
            complteted_tasks.append(task)
    return complteted_tasks

#print(get_completed_tasks(tasks))

## Get tasks where time_taken is at least a given time
def get_tasks_taking_at_least(list, time):
    tasks_by_time = []
    for task in list:
        if task["time_taken"] >= time:
            tasks_by_time.append(task)
    return tasks_by_time

# print(get_tasks_taking_at_least(tasks, 15))

## Find a task with a given description
def get_task_with_description(list, description):
    for task in list:
        if task["description"] == description:
            return task  
# print(get_task_with_description(tasks, "Feed Cat"))

# Extention (Function): 

def get_tasks_by_status(list, status):
    tasks_by_status = []
    for task in list:
        if task["completed"] == status:
            tasks_by_status.append(task)
    return tasks_by_status
# print(get_tasks_by_status(tasks, True))