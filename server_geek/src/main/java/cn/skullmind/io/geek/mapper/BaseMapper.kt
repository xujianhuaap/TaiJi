package cn.skullmind.io.geek.mapper

interface BaseMapper <S,T>{
    /**
     * @Title 根据ID查询
     * @param pk
     * @return
     */
     fun findById(pk: S): T

    /**
     * @Title 根据对象插入数据
     * @author <font color="green">**Vincent.wang**</font>
     * @param t
     * @throws Exception
     * @return
     */
     fun insert(t: T): Int

    /**
     * @Title 根据PK删除
     * @author <font color="green">**Vincent.wang**</font>
     * @param pk
     * @throws Exception
     * @return
     */
     fun delete(pk: S): Int

    /**
     * @Title 根据用户修改
     * @author <font color="green">**Vincent.wang**</font>
     * @param t
     * @throws Exception
     * @return
     */
     fun update(t: T): Int

    /***
     * @Title 根据条件查询数据
     * @param map
     * 查询条件
     * @return 对象集合
     */
     fun findAllByFilter(map: Map<String, Any>): List<T>
}