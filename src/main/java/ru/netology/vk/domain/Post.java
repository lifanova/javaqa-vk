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
    /* Id автора, если запись была опубликована от имени сообщества и подписана пользователем */
    private int signerId;
    /* может ли текущий пользователь закрепить запись */
    private int canPin;
    /* Может ли текущий пользователь удалить запись  */
    private int canDelete;
    /* Может ли текущий пользователь редактировать запись */
    private int canEdit;
    /* Запись закреплена. */
    private int isPinned;
    /* Содержит ли запись отметку "реклама" */
    private int markedAsAds;
    /* Объект добавлен в закладки у текущего пользователя */
    private boolean isFavorite;
    /* Id отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.  */
    private int postponedId;
    /* Информация о записи VK Donut */
    private Donut donut;


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

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }
}
