package patterns.Command;

import java.util.ArrayList;
import java.util.List;

public class Server {
	List<ICommand> _commands = new ArrayList<>();
	public void monitor(){
		for(ICommand command:_commands){
			IResult result = command.execute();
			if(IResult.OK != result.getStatus())
				sendAlert(result.getMessage());
		}
	}
	public Server(){};
	public void sendAlert(String msg){
		System.out.println("Server 發現問題:"+msg);
	}
	public void addCommand(ICommand cmd){
		_commands.add(cmd);
	}
	public void removeCommand(ICommand cmd){
		_commands.remove(cmd);
	}

}
