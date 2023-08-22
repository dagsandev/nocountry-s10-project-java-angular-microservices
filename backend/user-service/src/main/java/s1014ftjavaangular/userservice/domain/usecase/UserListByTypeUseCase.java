package s1014ftjavaangular.userservice.domain.usecase;

import s1014ftjavaangular.userservice.domain.models.dto.response.UserResponse;

import java.util.List;

public interface UserListByTypeUseCase {

    List<UserResponse> findAllByType(String type);
}
