package cn.skullmind.io.server.service

import cn.skullmind.io.server.beans.UserInfo
import cn.skullmind.io.server.beans.UserInfoRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

interface UserInfoService{
    /**
     * 获取所有 UserInfo
     */
      fun findAll(): List<UserInfo>?

    /**
     * 新增 UserInfo
     *
     * @param userInfo
     */
      fun insertByUserInfo(userInfo: UserInfo): UserInfo?

    /**
     * 更新 UserInfo
     *
     * @param userInfo
     */
      fun update(userInfo: UserInfo): UserInfo?

    /**
     * 删除 UserInfo
     *
     * @param id 编号
     */
      fun delete(id: Int)

    /**
     * 获取 UserInfo
     *
     * @param id 编号
     */
      fun findById(id: Int?): UserInfo?
}

@Service
class UserInfoServiceImp:UserInfoService{
    @Autowired  var repo:UserInfoRepo?=null

    override fun findAll(): List<UserInfo>? {
        return repo?.findAll()
    }

    override fun insertByUserInfo(userInfo: UserInfo): UserInfo? {
        return repo?.save(userInfo)
    }

    override fun update(userInfo: UserInfo): UserInfo? {
       return repo?.save(userInfo)
    }

    override fun delete(id: Int){
       repo?.deleteById(id)
    }

    override fun findById(id: Int?): UserInfo? {
       return repo?.findByIdOrNull(id)
    }
}