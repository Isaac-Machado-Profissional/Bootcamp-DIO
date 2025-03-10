import br.com.dio.dto.UserDTO;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        var dto = new UserDTO();
        dto.setId(2);
        dto.setName("Maria");
        dto.setBirthday(LocalDate.now().minusYears(30));
    }

}
