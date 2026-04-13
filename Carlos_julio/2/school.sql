CREATE DATABASE SchoolDB;
GO

USE SchoolDB;
GO

CREATE TABLE Course (
    id_course      INT IDENTITY(1,1) PRIMARY KEY,
    name           VARCHAR(50) NOT NULL,
    grade          VARCHAR(10) NULL,      -- por ejemplo "6", "7", "8"
    shift          VARCHAR(20) NULL,      -- mañana, tarde, noche
    is_active      BIT NOT NULL DEFAULT 1
);
GO
CREATE TABLE Classroom (
    id_classroom   INT IDENTITY(1,1) PRIMARY KEY,
    name           VARCHAR(50) NOT NULL,  -- Ej: "601A"
    capacity       INT NULL,
    floor          INT NULL
);
GO
CREATE TABLE Guardian (
    id_guardian    INT IDENTITY(1,1) PRIMARY KEY,
    full_name      VARCHAR(100) NOT NULL,
    phone          VARCHAR(20)  NULL,
    relationship   VARCHAR(30)  NULL      -- padre, madre, tío, etc.
);
GO
CREATE TABLE Teacher (
    id_teacher     INT IDENTITY(1,1) PRIMARY KEY,
    first_name     VARCHAR(50) NOT NULL,
    last_name      VARCHAR(50) NOT NULL,
    email          VARCHAR(100) NULL UNIQUE,
    phone          VARCHAR(20)  NULL
);
GO
CREATE TABLE Subject (
    id_subject     INT IDENTITY(1,1) PRIMARY KEY,
    name           VARCHAR(60) NOT NULL,
    credits        INT NULL
);
GO
CREATE TABLE Activity (
    id_activity    INT IDENTITY(1,1) PRIMARY KEY,
    name           VARCHAR(100) NOT NULL,
    description    VARCHAR(255) NULL,
    activity_date  DATE NULL
);
GO
CREATE TABLE Student (
    id_student     INT IDENTITY(1,1) PRIMARY KEY,
    name           VARCHAR(50) NOT NULL,
    last_name      VARCHAR(50) NULL,
    birthdate      DATE NULL,
    id_course      INT NOT NULL,
    id_classroom   INT NULL,
    id_guardian    INT NULL,
    CONSTRAINT FK_Student_Course
        FOREIGN KEY (id_course) REFERENCES Course(id_course),
    CONSTRAINT FK_Student_Classroom
        FOREIGN KEY (id_classroom) REFERENCES Classroom(id_classroom),
    CONSTRAINT FK_Student_Guardian
        FOREIGN KEY (id_guardian) REFERENCES Guardian(id_guardian)
);
GO
CREATE TABLE TeacherCourse (
    id_teacher     INT NOT NULL,
    id_course      INT NOT NULL,
    academic_year  INT NOT NULL,  -- Ej: 2025
    CONSTRAINT PK_TeacherCourse
        PRIMARY KEY (id_teacher, id_course, academic_year),
    CONSTRAINT FK_TeacherCourse_Teacher
        FOREIGN KEY (id_teacher) REFERENCES Teacher(id_teacher),
    CONSTRAINT FK_TeacherCourse_Course
        FOREIGN KEY (id_course) REFERENCES Course(id_course)
);
GO
CREATE TABLE StudentSubject (
    id_student     INT NOT NULL,
    id_subject     INT NOT NULL,
    school_year    INT NOT NULL,
    final_grade    DECIMAL(4,2) NULL, -- 0.00 a 10.00 por ejemplo
    CONSTRAINT PK_StudentSubject
        PRIMARY KEY (id_student, id_subject, school_year),
    CONSTRAINT FK_StudentSubject_Student
        FOREIGN KEY (id_student) REFERENCES Student(id_student),
    CONSTRAINT FK_StudentSubject_Subject
        FOREIGN KEY (id_subject) REFERENCES Subject(id_subject)
);
GO
CREATE TABLE StudentActivity (
    id_student     INT NOT NULL,
    id_activity    INT NOT NULL,
    role           VARCHAR(50) NULL,   -- participante, líder, etc.
    CONSTRAINT PK_StudentActivity
        PRIMARY KEY (id_student, id_activity),
    CONSTRAINT FK_StudentActivity_Student
        FOREIGN KEY (id_student) REFERENCES Student(id_student),
    CONSTRAINT FK_StudentActivity_Activity
        FOREIGN KEY (id_activity) REFERENCES Activity(id_activity)
);
GO
