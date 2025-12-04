package com.eap.message.eqp;

public class EqpMessageRep extends EqpMessageBase {

    public EqpMessageRep() {}
    
    public String carrierArrived() {

        try {
            // 1. MessageFormat 체크 (S6F11로 시작 여부만 확인)
            if (this.MessageFormat != null && this.MessageFormat.startsWith("S6F11")) {

                // 2. MessageName 체크 (CarrierArrived인지 확인)
                if ("CarrierArrived".equalsIgnoreCase(this.MessageName)) {
                    // 3. 필수값 검사 (eqpName, carrierId, lotId)
                    if (this.eqpName == null || this.eqpName.trim().isEmpty()) {
                        throw new IllegalArgumentException("error : eqpName이 비어있습니다");
                    }

                    if (this.carrierId == null || this.carrierId.trim().isEmpty()) {
                        throw new IllegalArgumentException("error : carrierId가 비어있습니다");
                    }

                    if (this.lotId == null || this.lotId.trim().isEmpty()) {
                        throw new IllegalArgumentException("error : lotId가 비어있습니다");
                    }

                    // 4. 조건이 모두 충족되면 SendMessage 설정
                    this.SendMessage = "EAPMES_CARRIER_ARRIVED";
                }
            }

            // 5. 최종적으로 전송할 메시지 문자열 반환
            return this.toString();

        } catch (IllegalArgumentException e) {
            // 필수값이 비어있을 때 오류 메시지 반환
            return e.getMessage();
        } catch (Exception e) {
            // 그 외의 예외 처리
            return "[ERROR] Unknown exception occurred : " + e.getMessage();
        }
    }

    
}
