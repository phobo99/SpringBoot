package vn.techmaster.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class EmployeePOJO {
    @NotNull
    @Schema(description = "Tên", example = "Đặng Phổ", required = true)
    @Size(min = 2, message = "firstName tối thiểu là 2 ký tự")
    String firstName;

    @NotNull
    @Schema(description = "Họ", example = "Lưu", required = true)
    @Size(min = 2, message = "lastName tối thiểu là 2 ký tự")
    String lastName;

    @NotBlank
    @Email
    @Schema(description = "Email", example = "abc@gmail.com", required = true)
    String emailID;

    @NotNull
    @Size(min = 2, message = "tối thiểu 2 ký tự")
    @Schema(description = "Hộ chiếu/CCCD/CMND", example = "0123456789", required = true)
    String passportNumber;
}
