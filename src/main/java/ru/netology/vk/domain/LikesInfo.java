package ru.netology.vk.domain;

public class LikesInfo {
    /* Число пользователей, которым понравилась запись */
    private int count;
    /* Наличие отметки «Мне нравится» от текущего пользователя */
    private boolean userLike;
    /* Может ли текущий пользователь поставить отметку «Мне нравится» */
    private boolean canLike;
    /* Может ли текущий пользователь сделать репост записи */
    private boolean canPublish;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserLike() {
        return userLike;
    }

    public void setUserLike(boolean userLike) {
        this.userLike = userLike;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
