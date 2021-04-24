package com.jack.service.impl;

import com.jack.dao.AccountDao;
import com.jack.pojo.Account;
import com.jack.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 查询所有账户
     *
     * @return
     */
    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    /**
     * 查询指定账户
     *
     * @param id
     * @return
     */
    @Override
    public Account findAccount(Integer id) {
        return accountDao.findAccount(id);
    }

    /**
     * 保存账户信息
     *
     * @param account
     */
    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    /**
     * 删除指定账户
     *
     * @param id
     */
    @Override
    public void deleteAccount(Integer id) {
        accountDao.deleteAccount(id);
    }
}
