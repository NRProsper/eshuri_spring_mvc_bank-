package dev.kiki.bank.account;

import dev.kiki.bank.account.dto.CreateAccountDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public Account createAccount(CreateAccountDto createAccountDto) {
        Account account = new Account();

        account.setAccountNumber(createAccountDto.accountNumber());
        account.setType(createAccountDto.type());
        account.setPanNumber(createAccountDto.panNumber());
        account.setCustomerName(createAccountDto.customerName());
        account.setAddress(createAccountDto.address());
        account.setIFCS(createAccountDto.IFCS());
        account.setEmail(createAccountDto.email());
        account.setPhone(createAccountDto.phone());


        return accountRepository.save(account);
    }

}
