package nsu.maxwell.mapper;

import nsu.maxwell.enity.User;
import nsu.maxwell.model.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User toEntity(UserDTO dto) {
        return new User(dto.getId(), dto.getUsername(), dto.getPassword());
    }

    public UserDTO toDTO(User entity) {
        return new UserDTO(entity.getId(), entity.getUsername(), entity.getPassword(), entity.getPassword());
    }
}
