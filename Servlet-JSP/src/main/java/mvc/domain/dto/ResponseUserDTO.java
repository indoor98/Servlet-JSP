package mvc.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseUserDTO {

	private String id;
	private String pwd;
	private String name;
	
	@Override
	public String toString() {
		return "ResponseUserDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}
	// etc ...
	
}
