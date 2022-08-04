package com.sparta.spring.service;

import com.sparta.spring.dto.UserRequestDto;
import com.sparta.spring.dto.ResponseDto;
import com.sparta.spring.model.User;
import com.sparta.spring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    @Transactional
    public ResponseDto<?> registerMember(UserRequestDto requestDto){
        String nickname = requestDto.getUsername();
        Optional<User> found = userRepository.findByNickname(nickname);
        if(found.isPresent()){
            return ResponseDto.fail("OVERLAP_MEMBER_ID","중복된 ID가 존재합니다");
        }
        if(requestDto.getPassword().equals(requestDto.getPasswordConfirm())){
            return ResponseDto.fail("PASSWORD_IS_DIFFERENT","비밀번호가 다릅니다.");
        }

        String password = passwordEncoder.encode(requestDto.getPassword());
        User user = new User(nickname,password);
        userRepository.save(user);

        return ResponseDto.success(user);
    }

}
