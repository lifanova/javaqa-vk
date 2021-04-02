package ru.netology.vk.domain;

public class RepostsInfo {
    /* Число пользователей, скопировавших запись */
    private int count;
    /* Наличие репоста от текущего пользователя*/
    private boolean userReposted;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserReposted() {
        return userReposted;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }
}
