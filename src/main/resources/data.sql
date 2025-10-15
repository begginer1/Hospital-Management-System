INSERT INTO patient (birth_date, email, gender, first_name, blood_group)
VALUES ('2001-10-11', 'sachinsajwan@gmail.com', 'Male', 'Sachin','A_POSITIVE');

INSERT INTO patient (birth_date, email, gender, first_name, blood_group)
VALUES ('1998-07-22', 'anita.sharma@example.com', 'Female', 'Anita','A_POSITIVE');

INSERT INTO patient (birth_date, email, gender, first_name, blood_group)
VALUES ('2003-03-15', 'rahul.verma@example.com', 'Male', 'Rahul','B_POSITIVE');

INSERT INTO patient (birth_date, email, gender, first_name, blood_group)
VALUES ('1995-12-30', 'neha.kapoor@example.com', 'Female', 'Neha','AB_NEGATIVE');

INSERT INTO patient (birth_date, email, gender, first_name, blood_group)
VALUES ('2000-06-05', 'amit.patel@example.com', 'Male', 'Amit','O_NEGATIVE');


Insert INTO doctor (name,specialization,email) VAlUES ('Dr. Rakesh Mehta','Cardiology','rakesh.mehta@gmail.com');
Insert INTO doctor (name,specialization,email) VAlUES ('Dr. Anita Verma', 'Dermatology', 'anita.verma@gmail.com');
Insert INTO doctor ( name,specialization,email) VAlUES ('Dr. Sanjay Patel', 'Orthopedics', 'sanjay.patel@gmail.com');
Insert INTO doctor (name,specialization,email) VAlUES ('Dr. Neha Gupta', 'Pediatrics', 'neha.gupta@gmail.com');

INSERT INTO appointment (appointment_time, reason, doctor_id, patient_id)
VALUES
('2025-07-02 11:00:00', 'Follow-up Consultation', 2, 3),
('2025-07-03 15:45:00', 'Cardiology Review', 1, 4),
('2025-07-04 10:15:00', 'Blood Pressure Check', 3, 1),
('2025-07-05 14:00:00', 'Post-Surgery Checkup', 4, 5);
