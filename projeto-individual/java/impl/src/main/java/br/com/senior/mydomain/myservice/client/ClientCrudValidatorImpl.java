package br.com.senior.mydomain.myservice.client;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.Client;
import br.com.senior.mydomain.myservice.ClientCrudValidator;
import br.com.senior.mydomain.myservice.ClientEntity;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ClientCrudValidatorImpl implements ClientCrudValidator {


    @Override
    public void beforeCreate(ClientEntity entity) {

        validateCPF(entity);
    }


    @Override
    public void beforeUpdate(ClientEntity entity) {

        validateCPF(entity);

    }

    @Override
    public void beforeDelete(Client.Id id) {

    }
    private static void validateCPF(ClientEntity entity) {
        Pattern pattern = Pattern.compile("(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(entity.getCpf());
        boolean matchFound = matcher.find();
            if(matchFound) {
                System.out.println("Match found");
            } else {
                throw new ServiceException(ErrorCategory.BAD_REQUEST, "Invalid CPF, please, use the right pattern: 'XXX.XXX.XXX-XXX'");
            }
    }
}
