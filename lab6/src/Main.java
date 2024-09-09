//Như chúng ta đã biết, FPT giờ đã không chỉ là một tập đoàn phát triển trong lĩnh vực công nghệ, họ đã dần chuyển qua nhiều lĩnh vực khác như bán mỹ phẩm, thuốc men, giáo dục …
//-> Chính vì sự phát triển ấy, chủ tịch Trương Gia Bình muốn tạo một ứng dụng để dễ dàng quản lý. Bước đầu ông muốn quản lý mảng: bán đồ công nghệ (FPT Shop) và giáo dục (Đh FPT)
//FPT Shop cần quản lý:
//	 Các sp công nghệ gồm Product: Id, name, status(mới hay cũ), price, description, quantity( số lượng)
//	+ Customer (id, name, phone, address, balance(số dư trong tài khoản) )
//	+ Staff (id, name, phone, address,  email)

//	+ Orders(id, orderDate, status, total, Customer)
//Đh FPT:
//	+ Teacher(id , name , phone, address, major(Chuyên môn) Tech, email )
//	+ Student(id, name, phone, address, email avgScore(điểm trung bình)  )
//	+ Subject (id, name, numberOfCredits(số tín chỉ) , TYPE)
//	+ enum TYPE {TECH, BUSINESS, LANGUAGE}
//	+ Class(Teacher, List<Student> , List<Subject> )

