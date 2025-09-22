# The Chamber of Coding Secret

This project is a solution to the "The Chamber of Coding Secret" exercise for the **INHN0002 Fundamentals of Programming** course, taught by Prof. Dr. Stefan Wagner. This assignment was a practical exercise in **Object-Oriented Programming (OOP)**, where the main objective was to model a magical lecture system for a school of witchcraft and wizardry by implementing a class hierarchy and a set of business rules for managing participants.

---

## Solution Overview

The solution models a university lecture system using a class hierarchy with an abstract `Participant` class and several concrete subclasses: `Professor`, `QuidditchTrainer`, `WizardAide`, and `Apprentice`. The central part of the solution is the `Lecture` class, which contains the logic for adding different types of participants based on a strict set of rules. The solution also includes an implementation for the `LectureHall` class.



---

## Implemented Functionalities

The solution successfully implements the required logic for the `addParticipant()` method in the `Lecture` class and the constructor for the `LectureHall` class. Each functionality was designed to handle specific business rules.

### `Lecture` Class

The `addParticipant()` method was implemented with a series of conditional checks to manage the addition of each participant type:

* **Apprentice Addition**: The method correctly adds an `Apprentice` to the lecture's dedicated list without any special conditions.
* **WizardAide Addition**: The method first checks if a `WizardAide` is already associated with the lecture. If they are a new aide, they are added to the list of `wizardAides`. If they are already associated with the lecture, they are instead added as an `Apprentice`.
* **QuidditchTrainer Addition**: Similar to the WizardAide, the method first verifies if a `QuidditchTrainer` is already assigned to the lecture. If not, they are added to the list of `quidditchTrainers`. If they are already assigned, they are added as an `Apprentice`.
* **Professor Addition**: The method ensures that only one `Professor` can be assigned to a lecture at a time. The first professor added is assigned to the `professor` attribute. If a subsequent professor attempts to join, a message is displayed indicating that the lecture already has a professor, and the new professor is not added.

### `LectureHall` Class

The constructor for the `LectureHall` class was implemented to enforce a minimum capacity. It ensures that any lecture hall has a capacity of at least 90. If a smaller capacity value is provided during instantiation, the capacity is automatically set to 90.
