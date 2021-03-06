package com.syou.emedia.server.model.terminal;

public class PFTerminal {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_terminal.terminal_id
     *
     * @mbggenerated
     */
    private Integer terminalId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_terminal.terminal_type
     *
     * @mbggenerated
     */
    private String terminalType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_terminal.terminal_name
     *
     * @mbggenerated
     */
    private String terminalName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_terminal.channel_id
     *
     * @mbggenerated
     */
    private Integer channelId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_terminal.terminal_id
     *
     * @return the value of platform_terminal.terminal_id
     *
     * @mbggenerated
     */
    public Integer getTerminalId() {
        return terminalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_terminal.terminal_id
     *
     * @param terminalId the value for platform_terminal.terminal_id
     *
     * @mbggenerated
     */
    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_terminal.terminal_type
     *
     * @return the value of platform_terminal.terminal_type
     *
     * @mbggenerated
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_terminal.terminal_type
     *
     * @param terminalType the value for platform_terminal.terminal_type
     *
     * @mbggenerated
     */
    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType == null ? null : terminalType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_terminal.terminal_name
     *
     * @return the value of platform_terminal.terminal_name
     *
     * @mbggenerated
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_terminal.terminal_name
     *
     * @param terminalName the value for platform_terminal.terminal_name
     *
     * @mbggenerated
     */
    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName == null ? null : terminalName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_terminal.channel_id
     *
     * @return the value of platform_terminal.channel_id
     *
     * @mbggenerated
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_terminal.channel_id
     *
     * @param channelId the value for platform_terminal.channel_id
     *
     * @mbggenerated
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_terminal
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", terminalId=").append(terminalId);
        sb.append(", terminalType=").append(terminalType);
        sb.append(", terminalName=").append(terminalName);
        sb.append(", channelId=").append(channelId);
        sb.append("]");
        return sb.toString();
    }
}