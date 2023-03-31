---
title:
---
classDiagram
    Secretariat "1" --> "*" Student
    Secretariat "1" --> "1" Registru
    Student "1" --> "*" Document
    Student "1" --> "*" Nota
    Registru "1" --> "M" Student
    class Secretariat {

    }
    class Student {
        String nume
        String prenume
    }
    class Nota {

    }
    class Registru {

    }
    class Document {

    }