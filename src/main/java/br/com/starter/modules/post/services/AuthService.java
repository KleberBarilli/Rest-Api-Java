package br.com.starter.modules.post.services;

import br.com.starter.modules.post.dtos.LoginDto;
import br.com.starter.modules.post.dtos.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
