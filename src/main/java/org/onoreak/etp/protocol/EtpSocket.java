package org.onoreak.etp.protocol;

import org.onoreak.etp.ProtocolHandler;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 4/26/17.
 */
public abstract class EtpSocket {

    private List<ProtocolHandler> _handlers = new ArrayList();

    public enum Role {
        Consumer,
        Producer
    }

    final Role _role;

    protected EtpSocket(Role role){
        _role = role;
    }

    public void addProtocolHandler(ProtocolHandler handler){
        _handlers.add(handler);
    }
}
