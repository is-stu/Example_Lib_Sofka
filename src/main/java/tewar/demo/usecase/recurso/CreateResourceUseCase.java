package tewar.demo.usecase.recurso;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import tewar.demo.domain.recurso.Resource;
import tewar.demo.domain.recurso.command.CreateResource;

public class CreateResourceUseCase extends UseCase<RequestCommand<CreateResource>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateResource> createResourceRequestCommand) {
        var command = createResourceRequestCommand.getCommand();
        var resource = new Resource(command.getResourceId(), command.getCategory(),
                command.getResourceName(), command.getDescription(), command.getBarCode(),
                command.getState());

        emit().onResponse(new ResponseEvents(resource.getUncommittedChanges()));
    }
}
