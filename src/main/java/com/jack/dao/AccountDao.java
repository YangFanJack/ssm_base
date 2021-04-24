package com.jack.dao;

import com.jack.pojo.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AccountDao {
    /**
     * 查询所有账户
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 查询指定账户
     * @param id
     * @return
     */
    @Select("select * from account where id = #{id}")
    public Account findAccount(Integer id);

    /**
     * 保存账户信息
     * @param account
     */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);

    /**
     * 删除指定账户
     * @param id
     */
    @Delete("delete from account where id = #{id}")
    public void deleteAccount(Integer id);
}
