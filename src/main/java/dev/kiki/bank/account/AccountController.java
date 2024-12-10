package dev.kiki.bank.account;

import dev.kiki.bank.account.dto.CreateAccountDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/create")
    public String createAccount(@ModelAttribute @Valid CreateAccountDto createAccountDto, Model model) {
        accountService.createAccount(createAccountDto);
        model.addAttribute("message", "Account created Successfully");
        return "redirect:/account";
    }

}
