package com.eap.message.eqp;

public class EqpMessageBase {

	protected String eqpName;
	protected String MessageName;
	protected String MessageFormat;
	protected String carrierId;
	protected String lotId;
	protected String SendMessage;
	
	public String getEqpName() {
		return eqpName;
	}
	public void setEqpName(String eqpName) {
		this.eqpName = eqpName;
	}
	public String getMessageName() {
		return MessageName;
	}
	public void setMessageName(String messageName) {
		MessageName = messageName;
	}
	public String getMessageFormat() {
		return MessageFormat;
	}
	public void setMessageFormat(String messageFormat) {
		MessageFormat = messageFormat;
	}
	public String getCarrierId() {
		return carrierId;
	}
	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}
	public String getLotId() {
		return lotId;
	}
	public void setLotId(String lotId) {
		this.lotId = lotId;
	}
	public String getSendMessage() {
		return SendMessage;
	}
	public void setSendMessage(String sendMessage) {
		SendMessage = sendMessage;
	}
	
	@Override
	public String toString() {
		return "EqpMessageBase [eqpName=" + eqpName + ", MessageName=" + MessageName + ", MessageFormat="
				+ MessageFormat + ", carrierId=" + carrierId + ", lotId=" + lotId + ", SendMessage=" + SendMessage
				+ "]";
	}
	//생성을 기능했다

	
	
	
	
}
