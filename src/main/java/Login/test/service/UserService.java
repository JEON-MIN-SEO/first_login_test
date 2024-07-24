package Login.test.service;

import Login.test.dto.UserDTO;
import Login.test.entity.UserEntity;
import Login.test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public void save(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userDTO.getName());
        userEntity.setFacilityCode(userDTO.getFacilityCode());
        userEntity.setPassword(userDTO.getPassword());
        userRepository.save(userEntity);
    }

    private UserEntity findByName(String name){
        return userRepository.findByName(name);
    }
}
