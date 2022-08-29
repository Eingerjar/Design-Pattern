public class MySqlUserInfoDao implements UserInfoDao{
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("MySql insertUserInfo");
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("MySql updateUserInfo");
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("MySql deleteUserInfo");
    }
}
