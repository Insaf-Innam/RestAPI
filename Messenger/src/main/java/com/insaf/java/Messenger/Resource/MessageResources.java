package com.insaf.java.Messenger.Resource;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.insaf.java.Messenger.model.Messages;
import com.insaf.java.Messenger.service.MessageService;
import com.insaf.java.Messenger.service.getAllMessages;

@Path("/message")
public class MessageResources {
	MessageService msservice = new MessageService();

	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Messages> getAllMessage() {
		return msservice.getAllMessages();
	}

	@GET
	@Path("/{mId}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Messages getMessage(@javax.ws.rs.PathParam("mId") Long id) {
		return msservice.getMessage(id);
	}

	@POST
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Messages addMessage(Messages message) {
		return msservice.addMessage(message);
	}

	@PUT
	@Path("/{messageId}")
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Messages updateMessage(@javax.ws.rs.PathParam("messageId") long id, Messages message) {
		message.setId(id);
		return msservice.updateMessage(message);
	}

	@DELETE
	@Path("/{mId}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Messages deleteMessage(@javax.ws.rs.PathParam("mId") long id) {
		return msservice.removeMessage(id);
	}

}
