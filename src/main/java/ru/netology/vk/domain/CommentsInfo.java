package ru.netology.vk.domain;

public class CommentsInfo {
    /* Количество комментариев */
    private int count;
    /* Может ли текущий пользователь комментировать запись */
    private boolean canPost;
    /* Могут ли сообщества комментировать запись */
    private boolean groupsCanPost;
    /* Может ли текущий пользователь закрыть комментарии к записи */
    private boolean canClose;
    /* Может ли текущий пользователь открыть комментарии к записи */
    private boolean canOpen;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
