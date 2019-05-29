package cn.skullmind.io.mobile.service

import cn.skullmind.io.mobile.beans.Order
import cn.skullmind.io.mobile.beans.OrderRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

interface OrderService{
    /**
     * 获取所有 UserInfo
     */
    fun findAll(): List<Order>?

    /**
     * 新增 Order
     *
     * @param Order
     */
    fun insertByOrder(order: Order): Order?

    /**
     * 更新 Order
     *
     * @param Order
     */
    fun update(order: Order): Order?

    /**
     * 删除 Order
     *
     * @param id 编号
     */
    fun delete(id: String)

    /**
     * 获取 Order
     *
     * @param id 编号
     */
    fun findById(id: String?): Order?
}

@Service
class OrderServiceImp:OrderService{
    @Autowired var repo: OrderRepo?=null
    override fun findAll(): List<Order>? {
        return repo?.findAll()
    }

    override fun insertByOrder(order: Order): Order? {
        return repo?.insert(order)
    }

    override fun update(order: Order): Order? {
        return repo?.save(order)
    }

    override fun delete(id: String) {
        repo?.deleteById(id)
    }

    override fun findById(id: String?): Order? {
        return repo?.findById(id)?.get()
    }
}