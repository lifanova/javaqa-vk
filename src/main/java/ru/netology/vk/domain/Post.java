package ru.netology.vk.domain;

import java.util.Date;

public class Post {
    private int id;
    /* Id владельца стены, на которой размещена запись */
    private int ownerId;
    /* Id автора записи */
    private int fromId;
    /* Id администратора, который опубликовал запись */
    private int createdBy;
    /* Дата поста */
    private Date date;
    /* Текст записи */
    private String text;
    /* Id владельца записи, в ответ на которую была оставлена текущая */
    private int replyOwnerId;
    /* Id записи, в ответ на которую была оставлена текущая */
    private int replyPostId;
    /* Запись создана с опцией «Только для друзей» */
    private boolean friendsOnly;

    /* Комментарии */
    private CommentsInfo commentsInfo;
    /* Источник материала, объект с полями*/
    private Copyright copyright;
    /* Информация о лайках к записи */
    private LikesInfo likesInfo;
    /* Информация о репостах записи («Рассказать друзьям»)*/
    private RepostsInfo repostsInfo;
    /* Информация о просмотрах записи */
    private ViewsInfo viewsInfo;
    /* Информация о местоположении */
    private Geo geo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public boolean getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }
}
