package org.onoreak.etp;

/**
 * Created by Chris on 4/26/17.
 */
public abstract class ProtocolHandler {

    final int _protocolNumber;

    ProtocolHandler(int protocolNumber){
        _protocolNumber = protocolNumber;
    }
}
