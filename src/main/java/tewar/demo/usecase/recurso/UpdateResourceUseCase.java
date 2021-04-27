package tewar.demo.usecase.recurso;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import tewar.demo.domain.recurso.Resource;
import tewar.demo.domain.recurso.command.UpdateResource;

public class UpdateResourceUseCase extends UseCase<RequestCommand<UpdateResource>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateResource> updateResourceRequestCommand) {

        var command = updateResourceRequestCommand.getCommand();
        var resource = Resource.from(command.getResourceId(), retrieveEvents());
        resource.updateResource(command.getCategory(),command.getResourceName(),command.getDescription(),
                command.getState());

        emit().onResponse(new ResponseEvents(resource.getUncommittedChanges()));

    }
}
