package dev.kiki.bank.account.dto;

import dev.kiki.bank.account.Type;
import jakarta.validation.constraints.*;

public record CreateAccountDto(
        @NotBlank(message = "Account number is required")
        @Size(min = 10, max = 18, message = "Account number must be between 10 and 18 characters")
        String accountNumber,

        @NotNull(message = "Account type is required")
        Type type,

        @NotNull(message = "PAN number is required")
        @Min(value = 100000000, message = "PAN number must have at least 9 digits")
        @Max(value = 999999999, message = "PAN number cannot exceed 9 digits")
        Integer panNumber,

        @NotBlank(message = "Customer name is required")
        @Size(max = 100, message = "Customer name must not exceed 100 characters")
        String customerName,

        @NotBlank(message = "Address is required")
        @Size(max = 255, message = "Address must not exceed 255 characters")
        String address,

        @NotBlank(message = "Phone number is required")
        @Pattern(regexp = "\\+?[0-9]{10,15}", message = "Enter a valid phone number")
        String phone,

        @Email(message = "Enter a valid email")
        @NotBlank(message = "Email is required")
        String email,

        @NotBlank(message = "IFCS code is required")
        @Pattern(regexp = "[A-Za-z]{4}\\d{7}", message = "Enter a valid IFCS code")
        String IFCS
) {}
