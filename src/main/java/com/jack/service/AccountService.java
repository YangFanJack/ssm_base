package com.jack.service;

import com.jack.pojo.Account;

import java.util.List;

public interface AccountService {
    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 查询指定账户
     * @param id
     * @return
     */
    public Account findAccount(Integer id);

    /**
     * 保存账户信息
     * @param account
     */
    public void saveAccount(Account account);

    /**
     * 删除指定账户
     * @param id
     */
    public void deleteAccount(Integer id);
}
