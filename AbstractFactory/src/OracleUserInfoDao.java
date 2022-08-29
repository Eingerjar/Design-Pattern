public class OracleUserInfoDao implements UserInfoDao{
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Oracle insertUserInfo");
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Oracle updateUserInfo");
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Oracle deleteUserInfo");
    }
}
