import axios from 'axios';
import authHeader from './auth-header';

const API_URL = 'http://localhost:8080/api/product/';

class UserService {
  async getAllItems() {
    return await axios.get(API_URL, { headers: authHeader() });
  }

  
}

export default new UserService();
