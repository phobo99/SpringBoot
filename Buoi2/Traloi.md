#1. Đối tượng Bean và Component khi đăng ký vào Application Context có đặc điểm gì?
	Trả lời : - @Component thì đánh dấu cho class còn @Bean thì đánh dấu phương thức (phương thức đó trả về đối tượng cụ thể)
	cần có @Configurat0ion trên Class chứa các method đó (cả class chứa và các @bean bên trong đều được nạp vào context)
	Tên của Bean sẽ là tên phương thức
#2. 2. Khi cần chọn để tuỳ biến tạo đối tượng, chúng ta chọn annotation nào ```@Component``` hay ```@Bean```?
	Trả lời: Nên dùng @Bean vì có thể tùy biến bằng cách truyền tham số vào method
#3. Khái niệm Singleton?
	Trả lời: Singleton là một Design pattern rất hay được sử dụng trong thực tế.
	Trong công nghiệp phần mềm, mô hình Singleton là một mẫu thiết kế phần mềm để hạn chế sự khởi tạo của lớp đối tượng.
	Điều này rất hữu ích khi cần một đối tượng chính xác để điều phối hành động trên toàn hệ thống.
	Khái niệm đôi khi được khái quát hóa cho các hệ thống vận hành hiệu quả hơn khi chỉ có một đối tượng tồn tại hoặc hạn chế sự khởi tạo cho một số lượng đối tượng nhất định.
	Thuật ngữ này xuất phát từ khái niệm toán học của một singleton.
	Trong design pattern, mẫu thiết kế Singleton Pattern được dùng để đảm bảo chỉ có duy nhất một instance trong một class, và class đó sẽ cung cấp phương thức toàn cục để truy cập đến thực thể đó.
	Như vậy, Singleton Pattern được dùng khi bạn tạo ra một class mà bạn chỉ muốn chỉ có duy nhất một thực thể là instance của class đó và bạn có thể truy cập đến nó ở bất kỳ nơi đâu khi bạn muốn.