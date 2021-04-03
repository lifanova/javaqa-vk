package ru.netology.vk.domain;

public class Donut {
    /* Запись доступна только платным подписчикам VK Donut */
    private boolean isDonut;
    /* Время, в течение которого запись будет доступна только платным подписчикам VK Donut */
    private int paidDuration;
    /* Заглушка для пользователей, которые не оформили подписку VK Donut */
    private Object placeholder;
    /* Можно ли открыть запись для всех пользователей */
    private boolean canPublishFreeCopy;
    /* Какие значения VK Donut можно изменить в записи */
    private String editMode;


    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public Object getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(Object placeholder) {
        this.placeholder = placeholder;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
