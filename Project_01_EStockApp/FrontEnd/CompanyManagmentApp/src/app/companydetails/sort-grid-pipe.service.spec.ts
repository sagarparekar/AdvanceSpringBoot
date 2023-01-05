import { TestBed } from '@angular/core/testing';

import { SortGridPipeService } from './sort-grid-pipe.service';

describe('SortGridPipeService', () => {
  let service: SortGridPipeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SortGridPipeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
