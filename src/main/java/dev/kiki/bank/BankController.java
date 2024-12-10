package dev.kiki.bank;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class BankController {

    @ModelAttribute("links")
    public List<Link> getLinks() {
        return Arrays.asList(
                new Link("Home", "/"),
                new Link("Transfer", "/transfer"),
                new Link("Account", "/account"),
                new Link("Cards", "/cards"),
                new Link("Profile", "/profile"),
                new Link("Apply for Card", "/apply"),
                new Link("Logout", "/logout")
        );
    }

    @GetMapping
    public String homePage(Model model) {
        model.addAttribute("content", "index.html");
        return "layout";
    }

    @GetMapping("/transfer")
    public String transfer(Model model) {
        model.addAttribute("content", "transfer.html");
        return "layout";
    }

    @GetMapping("/account")
    public String account(Model model) {
        model.addAttribute("content", "account.html");
        return "layout";
    }

    @GetMapping("/cards")
    public String  cards(Model model) {
        model.addAttribute("content", "cards.html");
        return "layout";
    }

    @GetMapping("/profile")
    public String profile(Model model) {
        model.addAttribute("content", "profile.html");
        return "layout";
    }

}
