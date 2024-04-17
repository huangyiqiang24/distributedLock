package cn.huayq.distributedLock;

/**
 * @Author: huangyiqiang
 * @Description: 分布式锁服务
 * @Date: Created in 15:46 2024/4/15
 */
public interface LockService {
    
    void setLockKey();

    boolean tryLock();

    boolean unLock();

}
